public class Neptune implements Planets {
    private static Neptune INSTANCE; // створюємо приватну статичну змінну для синглтона - ОБРАЗЕЦ

    private Neptune() {} // створюємо приватний конструктор класу, який забороняє створювати нові об'єкти за межами цього класу
    // (це реалізує можливість бути класу Синглтоном)

    public static Neptune getInstance() { // публічний статичний метод, який повертає екземпляр класу, цей метод називається
        // getInstance - отримати екземпляр. Це глобальна точка доступу до екземпляра класу. Метод дозволяє виконати ліньове
        // завантаження
        if (INSTANCE == null) { // якщо ОБРАЗЕЦ не створений (не ініціалізований), то
            synchronized (Neptune.class) { // виконуємо синхронізацію для потокобезпеки (при багатопоточності)
                if (INSTANCE == null) { // ще раз перевіряємо, що ОБРАЗЕЦ не створений (не ініціалізований)
                    INSTANCE = new Neptune(); // ініціалізуємо його
                }
            }
        }
        return INSTANCE; // повертаємо проініціалізований ОБРАЗЕЦ
    }
}
