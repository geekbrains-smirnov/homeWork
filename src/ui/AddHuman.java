package ui;

public class AddHuman implements Command {
    private final Console console;

    public AddHuman(Console console) {
        this.console = console;
    }

    @Override
    public String getDescription() {
        return "Добавить человека";
    }

    @Override
    public void execute() {
        console.add();
    }
}
