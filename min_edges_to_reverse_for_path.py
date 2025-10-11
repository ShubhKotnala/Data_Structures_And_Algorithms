def solve(mp, v, s, src, dst, dp):
    
    if v[src] == 1:
        return 10**9 - 1000
    
    if src == dst:
        return 0
    
    _key = s + "-" + str(src)
    
    if _key in dp:
        return dp[_key]
    
    v[src] = 1
    minStep = 10**9 - 1000
    
    if src in mp:
        for key in mp[src]:
            temp = s + str(key[0])
            if key[1] == -1:
                minStep = min(minStep, 1 + solve(mp, v, temp, key[0], dst, dp))
            else:
                minStep = min(minStep, solve(mp, v, temp, key[0], dst, dp))
    
    v[src] = -1
    dp[_key] = minStep
    return minStep

def minimumEdgeReversal(edges, n, src, dst):
    mp = {}
    for edge in edges:
        if edge[0] in mp:
            mp[edge[0]].append((edge[1], 1))
        else:
            mp[edge[0]] = [(edge[1], 1)]
        if edge[1] in mp:
            mp[edge[1]].append((edge[0], -1))
        else:
            mp[edge[1]] = [(edge[0], -1)]
    
    v = [-1]*(n+1)
    dp = {}
    step = solve(mp, v, str(src), src, dst, dp)
    return -1 if step == 10**9 - 1000 else step

if __name__ == "__main__":
    edgeList = [ [0, 1], [2, 1], [2, 3], [6, 3], [6, 4], [4, 5], [5, 1] ]
    n = 7; src = 0; dst = 6
    print(minimumEdgeReversal(edgeList, n, src, dst))
