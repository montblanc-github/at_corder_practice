A,B,M = gets.split.map(&:to_i)

a = gets.split.map(&:to_i)

b = gets.split.map(&:to_i)

ans = [a.min + b.min]

M.times do |i|
    x,y,c = gets.split.map(&:to_i)
    ans << a[x-1] + b[y-1] - c
end

puts ans.min