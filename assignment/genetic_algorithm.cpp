#include <bits/stdc++.h>
using namespace std;


mt19937 rng(chrono::steady_clock::now().time_since_epoch().count());

int64_t rnd(int64_t l, int64_t r) {
    return l + rng() % (r - l + 1);
}

void print_board(vector <int> board) {
    int n = board.size();
    string border = "";
    for(int j = 1; j <= n; j++) 
        border += "|---";
    border += "|";
    cout << border << endl;
    for(int i = 1; i <= n; i++) {
        for(int j = 1; j <= n; j++) {
            string s = "|   ";
            if(board[i - 1] == j - 1) {
                s[2] = 'Q';
            }
            cout << s;
        }
        cout << "|" << endl;
        cout << border << endl;
    }
}

int score(vector <int> p) {
    int c = 0, n = p.size();
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < i; j++) {
            if((p[i] == p[j]) || (i + p[i] == j + p[j]) || (i - p[i] == j - p[j])) {
                ++c;
            }
        }
    }
    return c;
} 


vector <int> random_permutation(int n) {
    vector <int> p(n);
    for(int i = 0; i < n; i++) p[i] = i;
    shuffle(p.begin(), p.end(), rng);
    return p;
}

vector <vector <int>> get_first_gen(int n, int K = 500) {
    vector <vector <int>> population;
    for(int i = 0; i < K; i++) {
        population.push_back(random_permutation(n));
    }
    return population;
}

bool check(vector <vector <int>> P, vector <int> &ans) {
    ans = P[0];
    for(vector <int> v: P) if(score(v) < score(ans)) {
        ans = v;
    }
    return score(ans);
}

void crossOverGenes(vector <int> &a, vector <int> &b) {
    for(int i = 1; i < a.size(); i++) {
        if(abs(a[i] - a[i - 1]) < 2) swap(a[i], b[i]);
        if(abs(b[i] - b[i - 1]) < 2) swap(a[i], b[i]);
    }
}

void mutation(vector <int> &a) {
    int n = a.size();
    vector <int> new_a, f(n, 0);

    for(int x: a) if(!f[x]) {
        new_a.push_back(x);
        f[x] = true;
    }

    for(int i = 0; i < a.size(); i++) if(!f[i]) {
        new_a.push_back(i);
    }

    int l = rnd(0, n / 2 - 1), r = rnd(n / 2, n - 1);
    a = new_a;
    swap(a[l], a[r]);
}

void crossOverAndMutant(vector <vector <int>> &P) {
    int k = P.size();
    for(int i = 1; i < k; i += 2) {
        vector <int> a = P[i - 1], b = P[i];
        crossOverGenes(a, b);
        mutation(a);
        mutation(b);
        P.push_back(a);
        P.push_back(b);
    }
}


int32_t main(int argc, char* argv[]) {
    ios_base :: sync_with_stdio(0); cin.tie(0); cout.tie(0);
    
    int n = stoi(argv[1]);

    vector <int> ans;
    vector <vector <int>> P = get_first_gen(n);

    int generation = 1;

    while(check(P, ans)) {
        crossOverAndMutant(P);
        sort(P.begin(), P.end(), [&](vector <int> x, vector <int> y) {return score(x) < score(y);});
        int K = P.size();
        while(P.size() > K / 2) P.pop_back();
        ++generation;

    }
}
