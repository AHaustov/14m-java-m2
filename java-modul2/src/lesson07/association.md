# Реляции(relation) - отношения между классами

1. Наследование
    - Животное <- уточка
    - человек <- работник
    - человек <- студент
    - товар <- овощи <- баклажан
2. Агрегация - Aggregation
    - Футбольная команда <- игроки. 
    - Телран-курс <- ученики
3. Композиция - Composition
    - Дом <- квартира
    - Заказ <- отдельные позиции 
    - Бутылка <- донышко
4. Ассоциация - Association
   - Человек - дверь - ключ
   - Человек - зарплата
   - Человек - еда
   - Человек(водитель) - машина

## Реляционные базы данных и отношения

1. Один к одному (1-1)
2. Один к много (1-n)
3. Много к много(m-n)

# Пример

Университет - студент
1. Композиция  - нет
2. Наследование - нет
Университет - кафедра- специальность- курс - группа - студент

## Дополнительные ссылки

1. [Hibernate](https://ru.wikipedia.org/wiki/Hibernate_(%D0%B1%D0%B8%D0%B1%D0%BB%D0%B8%D0%BE%D1%82%D0%B5%D0%BA%D0%B0))
2. [Association In Java – Explore the Concepts of Composition & Aggregation](https://data-flair.training/blogs/association-in-java/)
3. [Understanding Association, Aggregation, and Composition
](https://www.codeproject.com/Articles/330447/Understanding-Association-Aggregation-and-Composit)
4. [Отношения между классами (объектами)](http://java-course.ru/begin/relations/)
5. MySQL, SQL, реляционные базы данных

