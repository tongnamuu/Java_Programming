package DataStructure;

import java.nio.file.WatchEvent;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @title : UnionFind
 * @problem : https://www.acmicpc.net/problem/11085
 */

public class UnionFind_02 {
    static class Edge {
        int from, to, width;

        Edge(int from, int to, int width) {
            this.from = from;
            this.to = to;
            this.width = width;
        }
    }

    static class UF {
        int[] p;
        int[] SZ;

        UF(int n) {
            p = new int[n + 1];
            SZ = new int[n + 1];
            for (int i = 1; i <= n; ++i) {
                p[i] = i;
                SZ[i] = 1;
            }
        }

        int find(int now) {
            if (now == p[now])
                return now;
            return p[now] = find(p[now]);
        }

        Boolean merge(int x, int y) {
            x = find(x);
            y = find(y);
            if (x == y)
                return false;
            if (SZ[x] < SZ[y]) {
                p[x] = y;
                SZ[y] += SZ[x];
            } else {
                p[y] = x;
                SZ[x] += SZ[y];
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int e = sc.nextInt();
        UF uf = new UF(n);
        Edge[] edge = new Edge[m];
        for (int i = 0; i < m; ++i) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            edge[i] = new Edge(a, b, c);
        }
        Arrays.sort(edge, new Comparator<Edge>() {
            public int compare(Edge u, Edge v) {
                return v.width - u.width;
            }
        });
        for (int i = 0; i < m; ++i) {
            int to = edge[i].to;
            int from = edge[i].from;
            int w = edge[i].width;
            if (uf.merge(to, from)) {
                if (uf.find(s) == uf.find(e)) {
                    System.out.println(w);
                    break;
                }
            }
        }
        sc.close();
    }
}