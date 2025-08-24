#!/bin/bash

# Performance Monitor Script for Java Development
# Run this script to check system performance and optimize if needed

echo "🚀 System Performance Monitor"
echo "=============================="

# Check memory usage
echo "📊 Memory Usage:"
vm_stat | grep -E "(free|active|inactive|wired)" | head -4

# Check CPU usage
echo ""
echo "💻 CPU Usage:"
top -l 1 | grep "CPU usage" | head -1

# Check load average
echo ""
echo "⚖️  Load Average:"
uptime | awk '{print $10, $11, $12}'

# Check Java processes
echo ""
echo "☕ Java Processes:"
ps aux | grep java | grep -v grep | wc -l | awk '{print $1 " Java processes running"}'

# Check VS Code processes
echo ""
echo "💻 VS Code Processes:"
ps aux | grep "Code Helper" | grep -v grep | wc -l | awk '{print $1 " VS Code helper processes"}'

# Check disk space
echo ""
echo "💾 Disk Space:"
df -h / | tail -1 | awk '{print "Used: " $3 " Available: " $4 " (" $5 " full)"}'

# Quick cleanup function
cleanup() {
    echo ""
    echo "🧹 Running Quick Cleanup..."
    
    # Clear temporary files
    sudo rm -rf /tmp/* 2>/dev/null
    
    # Clear user caches
    rm -rf ~/Library/Caches/com.apple.Safari* 2>/dev/null
    rm -rf ~/Library/Caches/Google* 2>/dev/null
    
    # Purge inactive memory
    sudo purge
    
    echo "✅ Cleanup completed!"
}

# Check if cleanup is requested
if [ "$1" = "cleanup" ]; then
    cleanup
fi

echo ""
echo "💡 Usage: $0 [cleanup]"
echo "   Run '$0 cleanup' to perform system cleanup"
echo ""
echo "🎯 For maximum performance:"
echo "   - Close unused browser tabs"
echo "   - Restart VS Code periodically"
echo "   - Run 'mvn clean' in your projects"
echo "   - Use 'code-fast' alias for lightweight VS Code"
