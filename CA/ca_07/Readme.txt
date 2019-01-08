references:
    https://stackoverflow.com/questions/277364/java-enum-vs-string-as-parameters
    https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
    Head First Design Patterns pg 411
    https://stackoverflow.com/questions/1658192/what-is-the-difference-between-strategy-design-pattern-and-state-design-pattern


1. 
    Enter a number between 2 and 12 to test
    3
    CrapsState.play() - calling on...
    CrapsGameState.play()
    setState( :LOOSE)
    Enter a number between 2 and 12 to test
    7
    LooseState.play() - rolled: 7
    decrease credits
    setState( :CRAPS)

    The above console interaction and input highlights the problem. 
    Should a player be in 'Loose' or 'Win' state ('Loose' in this case), 
    they should then be immediately be brought to the 'Craps' state 
    (assuming we want the user to return to the state the game began in).
    
    Currently when the User enters the 'Loose' or 'Win' state, they are not 
    immediately brought to the 'Craps'. which means the user's next input is 
    interpreted under that state as opposed to correclty being evaluated under
    the 'Craps' state.

        static void setState(String gameStateName){
            System.out.println("setState( :"+gameStateName+")");
            gameState = getState(gameStateName);
            //THERE IS NOTHING HERE TO BRING WIN OR LOOSE TO CRAPS
            gameState.doEnterStateActivity();

2.
    02...String uses String literals in order to indicate the current gameState
    This means that in the event of a typo or incorrect State reference (ie. Test), 
    the client will encounter a runtime error.

    03...Enum uses a special data type that enables for a variable to be a set of predefined constants.
    The variable must be equal to one of the values that have been predefined for it
    This means that in the similar event of a typo or incorrect State reference, the 
    the client will encounter a compiler error.

    Using 03...Enum is the best approach since its type-safe and quicker for comparing
    as opposed to Strings. 
    type-safe: ensures the compiler will validate data tpyes during compilation, 
    rather than at runtime comparing data values.


03.
    Both State Design Pattern and Strategy Design Pattern have similar structures

    The State Design Pattern helps an object to manage its state, while Strategy Design
    Pattern allows the client to choose different behaviours. 
    
    The Strategy Design Pattern is used to encapsulate related set of algorithms to 
    provide runtime flexibility to client. The client can choose any algorithm at
    runtime, without changing Context class, which uses Strategy object.

    also,
        States can replace themselves, while Strategies can not.

            static void setState(String gameStateName){
                System.out.println("setState( :"+gameStateName+")");
                gameState = getState(gameStateName);
                gameState.doEnterStateActivity();
            }
            static void setState(String gameStateName, int rollValue){
                CrapsGameState passedIn = getState(gameStateName);
                if(passedIn instanceof PointState){
                    ((PointState)passedIn).storePointValueAs(rollValue);
                }
                setState(gameStateName);
            }
            static CrapsGameState getState(String gameStateLookUp){
                return possibleStates.get(gameStateLookUp);
            }
        
        The client does not ineract with the states directly.

            public static void main(String[] args){
                GameController game = new GameController();
                game.start();
	        }

        States store a reference to the context object that contains them. Strategies do not.
        The State Design Pattern has a set of behaviours encapsulated in state objects. 
        The class which can be in either of these states is delegating to a specified state behaviour.
        States store a reference to the context object that contains them. Strategies do not.

    