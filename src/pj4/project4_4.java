package pj4;

public class project4_4 {
    public static void main(String[] args){
        project4_3A que = new project4_3A(12);

        for (int i = 0; i < 7; i++) {
            que.enque(1);
        }
        que.enque(35);
        que.enque(56);
        que.enque(24);
        que.enque(68);
        que.enque(95);
        que.dump();

        for (int i = 0; i < 7; i++) {
            que.deque();
        }

        que.dump();

        que.enque(73);
        que.enque(19);

        que.indexOf(68);
    }
}
