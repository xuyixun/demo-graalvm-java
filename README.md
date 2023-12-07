# spring mvc bind request parameters to object failed with graalvm native image
```
java.lang.IllegalStateException: No primary or single unique constructor found for class
```
## Two-way to fix
### 1. use @ModelAttribute on request object (recommend)
```java
@GetMapping("/model_attribute")
public String modelAttribute(@ModelAttribute ModelAttributeDto dto){
//
}
```
### 2. use @RegisterReflectionForBinding to request object on main class 
```java
@RegisterReflectionForBinding(RegisterReflectionForBindingDto.class)
@SpringBootApplication
public class DemoApplication{
  //
}
```

# graalvm native image run failed
```
The current machine does not support all of the following CPU features that are required by the image: [CX8, CMOV, FXSR, MMX, SSE, SSE2, SSE3, SSSE3, SSE4_1, SSE4_2, POPCNT, LZCNT, AVX, AVX2, BMI1, BMI2, FMA].
Please rebuild the executable with an appropriate setting of the -march option.
```
## if use `gradle bootBuildImage` build
```groovy
tasks.named("bootBuildImage") {
    environment["BP_NATIVE_IMAGE_BUILD_ARGUMENTS"] = "-march=compatibility"
}
```
## if use `gradle nativeCompile` build
```groovy
graalvmNative {
    binaries.configureEach {
        buildArgs.add("-march=compatibility")
    }
}
```