package com.example.demo;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.generator.GeneratorCreationContext;
import org.hibernate.generator.internal.CurrentTimestampGeneration;
import org.springframework.aot.hint.ExecutableMode;
import org.springframework.aot.hint.RuntimeHints;
import org.springframework.aot.hint.RuntimeHintsRegistrar;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportRuntimeHints;
import org.springframework.lang.Nullable;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Member;

@ImportRuntimeHints({HibernateNativeHints.class})
@Configuration
public class HibernateNativeHints
implements RuntimeHintsRegistrar{
  @Override
  public void registerHints(RuntimeHints hints,
                            @Nullable ClassLoader classLoader){
    try{
      hints.reflection()
           .registerConstructor(ReflectionUtils.accessibleConstructor(CurrentTimestampGeneration.class,
                                                                      CreationTimestamp.class,
                                                                      Member.class,
                                                                      GeneratorCreationContext.class),
                                ExecutableMode.INVOKE);
    }catch(NoSuchMethodException e){
      throw new RuntimeException(e);
    }
  }
}
