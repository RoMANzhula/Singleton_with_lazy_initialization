public class Sun implements Planets {
    private static Sun INSTANCE; //створюємо приватну статичну змінну-екземпляр Синглетона

    private Sun() {} //створюємо приватний конструктор цього класу, який не дозволяє створювати нові об'єкти
    // поза межами цього класу (це реалізує можливість бути класу Синглетоном)

    public static Sun getInstance() { //публічний статичний метод, який повертає екземпляр класу, цей метод називається
        // getInstance - отримати екземпляр. Це глобальна точка доступу до екземпляру класу. Метод дозволяє виконати лінивий
        // завантаження
        if (INSTANCE == null) { //якщо ОБРАЗЕЦЬ не створений (не ініціалізований), то
            synchronized (Sun.class) { //виконуємо синхронізацію для потокобезпечності (при багатопоточності)
                if (INSTANCE == null) { //ще раз перевіряємо, що ОБРАЗЕЦЬ не створений (не ініціалізований)
                    INSTANCE = new Sun(); //ініціалізуємо його
                }
            }
        }
        return INSTANCE; //повертаємо ініціалізований ОБРАЗЕЦЬ
    }
}
