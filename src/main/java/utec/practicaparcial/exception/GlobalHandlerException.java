package utec.practicaparcial.exception;

import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class GlobalHandlerException {

    @ExceptionHandler({UserAlreadyExistException.class})
    public ProblemDetail genericHandler(UserAlreadyExistException ex) {
        ProblemDetail problemDetail = ProblemDetail.forStatus(409);
        problemDetail.setTitle("User Already Exist");
        problemDetail.setDetail(ex.getMessage());
        return problemDetail;
    }

}
