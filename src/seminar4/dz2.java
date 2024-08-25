package seminar4;

import java.util.LinkedList;

class MyQueueInt {
    // Напишите свое решение ниже
    private LinkedList<Integer> queue = new LinkedList<>();
    public void enqueue(int element){
        // Напишите свое решение ниже
        queue.addLast(element);
    }

    public int dequeue(){
        // Напишите свое решение ниже
        if(queue.isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return queue.removeFirst();
    }

    public int first(){
        if(queue.isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return queue.getFirst();
    }

    public LinkedList<Integer> getElements() {
        // Напишите свое решение ниже

        return new LinkedList<Integer>(queue);
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class dz2 {
    public static void main(String[] args) {
        MyQueueInt queue;
        queue = new MyQueueInt();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());


        System.out.println(queue.dequeue());
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}