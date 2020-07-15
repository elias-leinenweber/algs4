import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Permutation {
    public static void main(String[] args) {
        RandomizedQueue<String> rq;
        String s;
        int i, k, p;

        if (args.length == 1) {
            k = Integer.parseInt(args[0]);
            if (k > 0) {
                rq = new RandomizedQueue<>();
                for (i = 0; i < k; ++i)
                    rq.enqueue(StdIn.readString());
                p = 0;
                while (!StdIn.isEmpty()) {
                    s = StdIn.readString();
                    if (StdRandom.uniform(0, p + k + 1) < k) {
                        rq.dequeue();
                        rq.enqueue(s);
                    } else
                        ++p;
                }
                for (i = 0; i < k; ++i)
                    StdOut.print(rq.dequeue() + "\n");
            }
        }
    }
}
