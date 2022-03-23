N,M,C = gets.split.map(&:to_i)
B = gets.split.map(&:to_i)
A = []

N.times do
    A << gets.split.map(&:to_i)
end

ans = 0
for i in 0..N-1 do
    sum = 0
    for j in 0..M-1 do
        sum += A[i][j] * B[j]
    end
    if sum+C > 0
        ans += 1
    end
end

puts ans