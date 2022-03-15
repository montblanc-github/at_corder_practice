# 入力された値をa,bに代入。
a,b = gets.split.map(&:to_i)

# （if）入力値の範囲に0が含まれた場合、Zeroを出力。
if a <= 0 && 0 <= b
  puts "Zero"
# （elsif）入力値の範囲すべてがマイナスの場合、数字の個数が偶数の時は、Positiveを出力。
# 奇数の時は、Negativeを出力。
elsif b < 0
# b-a+1とすると、マイナス範囲の数字の個数が取得できる。（今回は、a<bでaの方が小さいため、b-a+1）
# => (-1)-(-3)+1 => (-1)+3+1 = 3個
  num = b-a+1
  if num.even?
    puts "Positive"
  else
    puts "Negative"
  end
# （else）入力値の範囲すべてがプラスの場合、Positiveを出力。
else
  puts "Positive"
end