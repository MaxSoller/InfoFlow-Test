package src.java.flow.utils;
import org.extendj.flow.utils.LabelDomain;

public @interface InfoFlowLabel {
    LabelDomain label() default LabelDomain.UNLABELED;
}