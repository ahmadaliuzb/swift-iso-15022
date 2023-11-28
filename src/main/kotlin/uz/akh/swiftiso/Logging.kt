package uz.akh.swiftiso

import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Pointcut
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component


@Aspect
@Component
class LoggingAspect(

) {
    private final val logger = LoggerFactory.getLogger(LoggingAspect::class.java)

    @Pointcut("execution(public String uz.akh.swiftiso.Controller.get())")
    fun publicMethods() {
    }

    @After("publicMethods()")
    fun logExecutionTime() {
        print("HEy")
    }
}
