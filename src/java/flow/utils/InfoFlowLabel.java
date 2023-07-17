package src.java.flow.utils;

public @interface InfoFlowLabel {
    LabelDomain label() default LabelDomain.UNLABELED;
}