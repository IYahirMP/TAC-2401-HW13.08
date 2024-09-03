package com.solvd.laba.computer_repair_service.model.computer.hardware;

public class Processor extends Hardware{
    public enum ProcessorArchitecture {ARM, X86, X86_64};
    private int cores;
    private int threads;
    private float baseClock;
    private int cache;
    private ProcessorArchitecture architecture;

    // Constructors
    public Processor() {
        // Default constructor can initialize values here
    }

    public Processor(int cores, int threads, float baseClock, int cache, ProcessorArchitecture architecture) {
        this.cores = cores;
        this.threads = threads;
        this.baseClock = baseClock;
        this.cache = cache;
        this.architecture = architecture;
    }

    // Getters and setters
    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public float getBaseClock() {
        return baseClock;
    }

    public void setBaseClock(float baseClock) {
        this.baseClock = baseClock;
    }

    public int getCache() {
        return cache;
    }

    public void setCache(int cache) {
        this.cache = cache;
    }

    public ProcessorArchitecture getArchitecture() {
        return architecture;
    }

    public void setArchitecture(ProcessorArchitecture architecture) {
        this.architecture = architecture;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Processor:\n");
        builder.append("  Cores: ").append(cores).append("\n");
        builder.append("  Threads: ").append(threads).append("\n");
        builder.append("  Base Clock: ").append(baseClock).append(" GHz\n");
        builder.append("  Cache: ").append(cache).append(" MB\n");
        builder.append("  Architecture: ").append(architecture).append("\n");
        return builder.toString();
    }
}