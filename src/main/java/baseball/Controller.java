package baseball;

public class Controller {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private Game game;
    
    public void play(){
        boolean running;
        do{
            Number player = inputView.printNumberInput();
            running = game.run(player);
            outputView.printResult(game.getScore());
        } while(running);
    }
}
