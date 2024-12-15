package SwingLearning.Temperature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        // Добавление слушателя для кнопки
        view.getConvertBtn().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Получение данных из поля ввода
                    String input = view.getCelsInput();
                    double celsius = Double.parseDouble(input);

                    // Конвертация температуры
                    double fahrenheit = model.converter(celsius);

                    // Обновление интерфейса
                    view.setFahrOutput(String.format("%.2f", fahrenheit));
                } catch (NumberFormatException ex) {
                    // Обработка ошибки ввода
                    view.setFahrOutput("Ошибка ввода");
                }
            }
        });
    }
}
