N = gets.to_i
a = gets.split.map(&:to_i).sort.reverse

alice = 0
bob = 0

for i in 1..N do
    if i.odd?
        alice += a.shift
    else
        bob += a.shift
    end
end

puts alice - bob