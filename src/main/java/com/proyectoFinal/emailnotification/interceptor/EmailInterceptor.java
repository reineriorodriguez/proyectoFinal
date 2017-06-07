package com.proyectoFinal.emailnotification.interceptor;

import com.proyectoFinal.emailnotification.email.SendEmailImpl;
import com.proyectoFinal.emailnotification.interceptorbinding.EmailInterceptorBinding;
import com.proyectoFinal.Entidades.Reserva;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@EmailInterceptorBinding
@Interceptor
public class EmailInterceptor {

    private static final Logger logger = 
            Logger.getLogger(EmailInterceptor.class.getName());

    @AroundInvoke
    public Object logMethodCall(InvocationContext invocationContext)
            throws Exception {

        Reserva b = (Reserva) invocationContext.getParameters()[0];

        Object retVal = invocationContext.proceed();
        SendEmailImpl.sendEMail("el666_18@hotmail.com",
                "el666_18@hotmail.com",
                "reserva", 
                "You have created a reserva: " + b.getAsiento());
        logger.log(Level.INFO, "Sent mail for book: \n"
                + "{0}",
                new Object[]{b.getFecha()
                });
        return retVal;
    }
}
