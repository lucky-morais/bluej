/**
 * Java8 POO + Constru��es Funcionais
 * Cap�tulo 7, p�gina 254
 *
 * @author      F. M�rio Martins
 * @version     12/07/2019
 */

MUITO IMPORTANTE:
-----------------
Quando se usa throws e throw, � preciso: criar as classes herdeiras de Exception e depois
"apanhar" as exce��es. Por exemplo, a classe StackLim tem o m�todo: push(Object elem) 
que usa os dois throws
1)
    public void push(Object elem) throws StackCheiaException {
        ...
        
        if(this.isFull())
            throw new StackCheiaException("Stack cheia @push!");
        else
            ...
            
        }

        ...
    }
   
2) cria��o da classe: StackCheiaException

public class StackCheiaException extends Exception {
    
    public StackCheiaException () {
        super();
    }
    
    public StackCheiaException (String msg) {
        super(msg);
    }    
}

3) Na classe que invoca o m�todo push:

    public static void main(String [] args) {
        StackLim stack1 = new StackLim (5);
        
        try {
           stack1.push("Maria");
        } catch(StackCheiaException sce) {
            System.out.println(sce.getMessage());
        }
        ...
    }
    
---------------------------------------------------------------------------
---------------------------------------------------------------------------

Desde Java7 que:
1) A clausula finally j� n�o se usa explicitamente. A JVM automaticamente 
   fecha todas as liga��es (mem�ria, ficheiros, bases de dados...) usando 
   assim o finally de forma impl�cita ap�s o �ltimo catch.
   
2) Tamb�m a partir do Java7 que � suportado o M�LTIPLO CATCH, ou seja:

            ...
            } catch(StackCheiaException | StackVaziaException sce) {
                ...
            }
            ...

