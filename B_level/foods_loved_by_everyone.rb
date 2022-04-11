N,M = gets.split.map(&:to_i)
b = Hash.new(0)

N.times do
    k,*a = gets.split.map(&:to_i)
    a.each do |i|
        # hashで扱うと、指定した数値のキーの数値を増やせる。
        b[i] += 1
    end
end

puts b.values.count(N)