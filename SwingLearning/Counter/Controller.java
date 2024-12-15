package SwingLearning.Counter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        // Добавление слушателей кнопок
        view.getIncrementButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.increment();
                view.setCountText(model.getCount());
            }
        });

        view.getResetButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.reset();
                view.setCountText(model.getCount());
            }
        });
    }
}
