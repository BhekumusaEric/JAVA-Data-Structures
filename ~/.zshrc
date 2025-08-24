# Java Performance Optimizations
export JAVA_OPTS="-Xmx4G -Xms1G -XX:+UseG1GC -XX:+UseStringDeduplication -XX:+OptimizeStringConcat"
export MAVEN_OPTS="-Xmx2G -Xms512m -XX:+UseG1GC"
export GRADLE_OPTS="-Xmx2G -Xms512m -XX:+UseG1GC -Dorg.gradle.daemon=true -Dorg.gradle.parallel=true"

# VS Code Performance
export VSCODE_DISABLE_CRASH_REPORTER=1
export VSCODE_DISABLE_UPDATES=1

# System Performance
export HISTSIZE=1000
export HISTFILESIZE=1000

# Disable unnecessary features
export DISABLE_AUTO_UPDATE=true
export DISABLE_UPDATE_PROMPT=true

# Java Development Paths (if needed)
# export JAVA_HOME=/usr/libexec/java_home
# export PATH=$JAVA_HOME/bin:$PATH

# Aliases for quick development
alias ll='ls -la'
alias la='ls -la'
alias mvnci='mvn clean install'
alias mvnct='mvn clean test'
alias code-fast='code --disable-extensions --disable-gpu'

# Performance monitoring aliases
alias memcheck='vm_stat'
alias cpucheck='top -l 1 -o cpu | head -20'
alias proccheck='ps aux | sort -k4 -nr | head -10'

echo "🚀 Java Development Environment Optimized!"
