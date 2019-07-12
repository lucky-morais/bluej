/**
 * Java8 POO + Construções Funcionais
 * Capítulo 7, página 254
 *
 * @author      F. Mário Martins
 * @version     12/07/2019
 */

MUITO IMPORTANTE:
-----------------
Quando se usa throws e throw, é preciso: criar as classes herdeiras de Exception e depois
"apanhar" as exceções. Por exemplo, a classe StackLim tem o método: push(Object elem) 
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
   
2) criação da classe: StackCheiaException

public class StackCheiaException extends Exception {
    
    public StackCheiaException () {
        super();
    }
    
    public StackCheiaException (String msg) {
        super(msg);
    }    
}

3) Na classe que invoca o método push:

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
1) A clausula finally já não se usa explicitamente. A JVM automaticamente 
   fecha todas as ligações (memória, ficheiros, bases de dados...) usando 
   assim o finally de forma implícita após o último catch.
   
2) Também a partir do Java7 que é suportado o MÚLTIPLO CATCH, ou seja:

            ...
            } catch(StackCheiaException | StackVaziaException sce) {
                ...
            }
            ...

