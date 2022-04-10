N,M = gets.split.map(&:to_i)
b = Hash.new(0)

N.times do
    k,*a = gets.split.map(&:to_i)
    a.each do |i|
        b[i] += 1
    end
end

puts b.values.count(N)