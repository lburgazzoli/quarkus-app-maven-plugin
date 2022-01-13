package io.github.lburgazzoli.qa;

import java.util.Collections;
import java.util.List;

import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.ResolutionScope;
import org.apache.maven.plugins.annotations.Mojo;

import io.quarkus.maven.BuildMojo;
import io.quarkus.maven.dependency.Dependency;
import io.quarkus.runtime.LaunchMode;

@Mojo(name = "generate-app", defaultPhase = LifecyclePhase.PACKAGE, requiresDependencyResolution = ResolutionScope.COMPILE_PLUS_RUNTIME, threadSafe = true)
public class GenerateAppMojo extends BuildMojo {

    @Override
    protected List<Dependency> forcedDependencies(LaunchMode mode) {
        return Collections.emptyList();
    }
}