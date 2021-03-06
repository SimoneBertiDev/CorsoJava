package it.eccezioni;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Serial;


//Gerarchia ERRORI/ECCEZIONI
//          Throwable
//     Error        Exception
//      JMV           Fase di esecuzione(nulpointer)...

public class JavaExec extends Exception{
    @Serial
    private static final long serialVersionUID = 5879087740116594416L;

    @Override
    public String getMessage() {
        return "ATTENZIONE: si è verificato un errore";
    }

    @Override
    public String getLocalizedMessage() {
        return super.getLocalizedMessage();
    }

    @Override
    public synchronized Throwable getCause() {
        return super.getCause();
    }

    @Override
    public synchronized Throwable initCause(Throwable cause) {
        return super.initCause(cause);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }

    @Override
    public void printStackTrace(PrintStream s) {
        super.printStackTrace(s);
    }

    @Override
    public void printStackTrace(PrintWriter s) {
        super.printStackTrace(s);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return super.fillInStackTrace();
    }

    @Override
    public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }

    @Override
    public void setStackTrace(StackTraceElement[] stackTrace) {
        super.setStackTrace(stackTrace);
    }
}
