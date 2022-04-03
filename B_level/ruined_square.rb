a,b,c,d =gets.split.map(&:to_i)

x = c-a
y = d-b

puts [c-y, d+x, a-y, b+x].join(' ')