## The Bowling Game Kata by Robert C. Martin
http://butunclebob.com/ArticleS.UncleBob.TheBowlingGameKata

#### Test One
- testGutterGame (20 times zero pins)

#### Test Two
- testAllOne (20 times one pins)

#### Test Three
- testOneSpare (roll 5, 5, 3 and 17 times 0 pins)
- realise that you have a bad design and the method "roll" is responsible for calculating the score
- as a consequence, store all rolls in an int[21]
- move calculation of score into the method score()
- implement "frame" to identify potential spares and later also strikes
- identify spare and add bonus to score
- replace i with the variable name frameIndex
- write isSpare method
- write rollSpare


#### Test Four
- testOneStrike (roll 10, 3, 4, 16x 0)
- identify a strike similar to the spare
- write strikeBonus
- write spareBonus
- write sumOfPinsInFrame
- write isStrike
- write rollStrike