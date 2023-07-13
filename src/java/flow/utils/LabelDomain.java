package org.extendj.flow.utils;

public enum LabelDomain { 
    ERROR(-1),
    LITERAL(0), 
    UNLABELED(0), 
    LOW(1), 
    HIGH(2);

    private Integer level;

    LabelDomain(int level) {
        this.level = level;
    }

    public boolean isHigherThan(LabelDomain other) {
        return this.level > other.level;
    }
}