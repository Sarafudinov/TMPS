// Caretaker

import java.util.Stack;

public class EditorHistory
{
    private Stack History;

    public EditorHistory()
    {
        History = new Stack();
    }

    public Stack getHistory() {
        return History;
    }

    public void setHistory(Stack history) {
        History = history;
    }

    public void Push(Memento memento) {
        System.out.println("Save game state");
        History.push(memento);
    }

    public Memento Pop(){
        System.out.println("Undo last action");
        return (Memento) History.pop();
    }
}
