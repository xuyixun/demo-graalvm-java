FROM ubuntu:latest
ARG project_name
ENV env_project_name $project_name
COPY build/native/nativeCompile app
ENTRYPOINT "./app/$env_project_name"