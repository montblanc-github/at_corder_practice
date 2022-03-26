N = gets.to_i
K = gets.to_i
x = gets.split.map(&:to_i)

def min(a, b)
    (a < b) ? a : b
end

ans = 0

N.times do |i|
    ans += min(x[i]*2, (K-x[i])*2)
end

puts ans