w = gets.chomp.chars

# uniqを用いることで、重複する文字を複数回処理することを防ぐ。
w.uniq.each do |c|
    if w.count(c).odd?
        puts "No"
        exit
    end
end

puts "Yes"