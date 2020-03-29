package DataStructure;

import java.util.Scanner;

/**
 * @title : UnionFind
 * @problem : https://www.acmicpc.net/problem/10775
 */
public class UnionFind {
    public static class UF {
        int[] SZ;
        int[] p;

        UF(final int n) {
            this.SZ = new int[n + 1];
            this.p = new int[n + 1];
            for (int i = 0; i <= n; ++i) {
                SZ[i] = 1;
                p[i] = i;
            }
        }

        public int find(int now) {
            while (now != p[now]) {
                p[now] = p[p[now]];
                now = p[now];
            }
            return now;
        }

        void merge(int x, int y) {
            x = find(x);
            y = find(y);
            if (x == y)
                return;
            if (SZ[x] < SZ[y]) {
                p[x] = y;
                SZ[y] += SZ[x];
            } else {
                p[y] = x;
                SZ[x] += SZ[y];
            }
        }
    }

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int m = sc.nextInt();
        final UF uf = new UF(n);
        final int p[] = new int[m];
        for (int i = 0; i < m; ++i) {
            p[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < m; ++i) {
            final int k = uf.find(p[i]);
            if (k == 0)
                break;
            uf.p[k] = k - 1;
            ++ans;
        }
        System.out.println(ans);
        sc.close();
    }

}