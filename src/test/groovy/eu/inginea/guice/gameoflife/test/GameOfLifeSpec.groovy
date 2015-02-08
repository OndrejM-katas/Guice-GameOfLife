package eu.inginea.guicekata.gameoflife.test
import spock.lang.*
import eu.inginea.guicekata.gameoflife.LifeBoard

class GameOfLifeSpec extends Specification {
  // fields
  // fixture methods
  // feature methods
  
    def "Life board is 10x10 big"() {
        given:
            def lifeBoard = initialLifeboard()
            
        expect:
            lifeBoard.width == 10
            lifeBoard.height == 10
    }

    def "Life board supports adding seed"() {
        given:
            def lifeBoard = initialLifeboard()
            
        when:
            def seed = simpleSeed()
            addSeedTo(lifeBoard, seed)
            
        then:
            def middlePoint = middlePointOf lifeBoard
            lifeBoard.valueAt(middlePoint) == seed[0,0]
    }
    
    // helper methods
  
    def initialLifeboard() {
        def lifeBoard = new LifeBoard()
    }
    
    def simpleSeed() {
        def X = true
        def O = false
        [[X,O,X],[O,X,O],[X,X,X]]
    }
    
    def addSeedTo(def lifeBoard, def seed) {
        putToMiddle(lifeBoard, seed)
    }
    
    def putToMiddle(def lifeBoard, def seed) {
        def middlePoint = middlePointOf lifeBoard
        putOnCoordinate(lifeBoard, seed, middlePoint)
    }
    
    def middlePointOf(def lifeBoard) {
        def middlePoint = lifeBoard.topLeft
        int x = (lifeBoard.width + 1) / 2
        int y = (lifeBoard.height + 1) / 2
        middlePoint = middlePoint.right(x-1)
        middlePoint = middlePoint.down(y-1)
        middlePoint
    }
    
    def putOnCoordinate(def lifeBoard, def seed, def middlePoint) {
        def lineOffset = middlePoint
        seed.each() {
            def pointCoord = lineOffset
            it.each() {
                lifeBoard.put(pointCoord)
                pointCoord = pointCoord.right()
            }
            lineOffset = lineOffset.down()
        }
    }
}