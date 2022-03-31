A,B,M = gets.split.map(&:to_i)

a = gets.split.map(&:to_i)

b = gets.split.map(&:to_i)

sale = []

M.times do
    sale << gets.split.map(&:to_i)
end

ans = [a.min + b.min]

M.times do |i|
    ans << a[sale[i][0]-1] + b[sale[i][1]-1] - sale[i][2]
end

puts ans.min