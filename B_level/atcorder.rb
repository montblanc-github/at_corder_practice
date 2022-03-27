require 'benchmark'

result = Benchmark.realtime do

    S = gets.chomp.chars
    c = 0
    ans = []

    S.each do |i|
        if "ACGT".include?(i)
            c += 1
        else
            ans << c
            c = 0
        end
    end

    ans << c

    puts ans.max

end

puts "処理 #{result}s"