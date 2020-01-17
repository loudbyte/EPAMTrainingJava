package _java._se._01._javadoc;

public class DocRequirement {
    /**
     *  Проверка: редактируема ли данная ячейка.
     *  <p> В слуяае если данная ячейка редактируема - возвращается true<p/>
     *  <p> В слуяае если данная ячейка не редактируема - возвращается false<p/>
     * @param column
     *          номер колонки для проверки
     * @return результат проверки
     */

    public boolean isCellEditable(int column) {
        return column % 2 == 0 ? true : false;
    }
}
