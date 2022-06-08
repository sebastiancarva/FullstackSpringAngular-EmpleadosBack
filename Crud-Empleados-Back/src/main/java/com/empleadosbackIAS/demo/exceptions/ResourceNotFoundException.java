
package com.empleadosbackIAS.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Avvy Aston
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    
    private static final long serialVersionUID=1L;
    
    public ResourceNotFoundException(String msj){
    super(msj);
    }
    
}
