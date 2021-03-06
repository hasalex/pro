package com.github.forax.pro.plugin.compiler;

import java.nio.file.Path;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

class Javac {
  private final int release;
  private final Path destination;
  private final List<Path> moduleSourcePath;
  
  private List<Path> modulePath;
  private List<String> rootModules;
  private boolean verbose; 
  private String lint;
  
  Javac(int release, Path destination, List<Path> moduleSourcePath) {
    this.release = release;
    this.destination = destination;
    this.moduleSourcePath = moduleSourcePath;
  }
  
  public int release() {
    return release;
  }
  public Path destination() {
    return destination;
  }
  public List<Path> moduleSourcePath() {
    return moduleSourcePath;
  }
  
  public boolean verbose() {
    return verbose;
  }
  public void verbose(boolean verbose) {
    this.verbose = verbose;
  }
  
  public Optional<String> lint() {
    return Optional.ofNullable(lint);
  }
  public void lint(String lint) {
    this.lint = Objects.requireNonNull(lint);
  }
  
  public Optional<List<Path>> modulePath() {
    return Optional.ofNullable(modulePath);
  }
  public void modulePath(List<Path> modulePath) {
    this.modulePath = Objects.requireNonNull(modulePath);
  }
  
  public Optional<List<String>> rootModules() {
    return Optional.ofNullable(rootModules);
  }
  public void rootModules(List<String> rootModules) {
    this.rootModules = Objects.requireNonNull(rootModules);
  }
}
