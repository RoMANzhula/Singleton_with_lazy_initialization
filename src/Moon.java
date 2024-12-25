public class Moon implements Planets {
    private static Moon INSTANCE; //створюємо приватну статичну змінну для синглетона - ОБРАЗЕЦ

    private Moon() {} //створюємо приватний конструктор класу, який не дозволяє створювати нові об'єкти
    // за межами цього класу (реалізує можливість бути класу Синглетоном)

    public static Moon getInstance() { //публічний статичний метод, який повертає екземпляр класу, цей метод називають
        // getInstance - отримати екземпляр. Це глобальна точка доступу до екземпляра класу. Метод дозволяє виконати лінійну
        //загрузку
        if (INSTANCE == null) { //якщо ОБРАЗЕЦ ще не створений (не ініціалізований), то
            synchronized (Moon.class) { //виконуємо синхронізацію для потокобезпеки (при багатопоточності)
                if (INSTANCE == null) { //ще раз перевіряємо, що ОБРАЗЕЦ не створений (не ініціалізований)
                    INSTANCE = new Moon(); //ініціалізуємо його
                }
            }
        }
        return INSTANCE; //повертаємо ініціалізований ОБРАЗЕЦ
    }
}
