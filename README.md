# Java
Java basic syntax and concepts for interview

### JVM(Java Virtual Machine)
> JVM은 자바 애플리케이션을 클래스 로더를 통해 읽어 들여 자바 API와 함께 실행하는 스택 기반의 가상머신
> 
> Java와 OS사이에의 중개자 역할, Java가 OS에 구애받지 않고 재사용을 가능하게 해 줌
> 
> 메모리관리, Garbage collection을 수행
>
### 자바프로그램 실행과정
> 프로그램 실행 시 JVM이 OS로부터 필요로하는 메모리를 할당받음. JVM은 용도에 따라 메모리를 여러 영역으로 나누어 관리.
> 
> 자바 컴파일러가 자바 소스코드(.java)를 읽어들여 자바 바이트코드(.class)로 변환시킴
> 
> class loader를 통해 class파일들을 JVM으로 로딩함
> 
> 로딩된 class 파일들은 Execution engine(실행 엔진)을 통해 해석됨
> 
> 해석된 바이트코드는 Runtime Data Areas에 배치되어 실질적인 수행이 이루어짐
> 
> 이 실행과정 속에서 JVM은 Thread Synchronization과 GC(Garbage Collection) 같은 관리작업을 수행
>
### GC(Garbage Collection)
> Java 에서는 개발자가 프로그램 코드로 메모리를 명시적으로 해제하지 않기 때문에 Garbage Collector가 더 이상 필요 없는 (쓰레기) 객체를 찾아 지우는 작업을 함
> 
> 'stop-the-world' : GC를 실행하기 위해서 JVM이 애플리케이션 실행을 멈추는 것
> 
> 'Mark and Sweep' : 사용되는 메모리와 사용되지 않는 메모리를 식별 -> Mark단계에서 사용되지 않는다고 식별된 메모리를 해제
> 
### Java Collection
> 종류 : List, Map, Set, Stack, Queue 인터페이스
>
> 사용이유 : 다수의 Data를 다루는 데 표준화된 클래스들을 제공하기 때문에 DataStructure을 직접 구현하지 않고 편하게 사용할 수 있기 때문 / 또한 배열과 다르게 객체를 보관하기 위한 공간을 미리 정하지 않아도 되므로, 상황에 따라 객체의 수를 동적으로 정할 수 있기 때문에 공간적인 효율성을 높여줌
>
> - List : ArrayList와 LinkedList가 있음
> 
> ArrayList : 순서대로 늘어선 배열구조라 index번호가 있어 조회가 빠르다. 하지만 list처럼 빈공간을 허용하지 않고 추가나 삭제시 채워나가면서 index번호가 바뀌므로 데이터의 추가나 삭제는 처리가 느리다. 빈번한 조회가 필요한 데이터에 적합. (Access time 성능이 좋으므로) (array와 list를 섞어놓은 구조)
>
> LinkedList : 노드(데이터와 다음 노드로 연결시킬 주소지)들이 줄줄이 연결된 자료구조이다. 맨 마지막에 있는 데이터를 검색해야한다면 처음부터 끝까지 노드를 타고 줄줄이 이동해야해서 조회에는 적합하지 않지만 삭제/삽입을 할 때는 중간에 해당 노드의 주소지만 바꿔주면 되므로 삽입/삭제가 빈번한 데이터에 적합 (순서대로 늘어선 구조로 index를 붙인게 아니라, 자료의 주소값으로 서로 연결되어있는 구조이므로 linked임!)
> 
> - Map : HashMap을 대표적으로 사용. key-value 구조로 이루어져 있으며 Hashtable과 비슷
> key를 기준으로 중복된 값을 저장하지 않으며 순서를 보장하지 않음. value는 중복된 값 허용
>
> key에 대해 순서를 보장하기 위해서 LinkedHashMap을 사용
>
> - Set : HashSet을 대표적으로 사용. 중복값을 저장하지 않음. 순서도 보장하지 않으며 순서보장을 위해서는 LinkedHashSet을 사용
>
> - Stack과 Queue
> Stack 객체는 직접 new 키워드로 사용. 쌓아올림. 후입선출. 삽입연산 'push', 삭제연산 'pop' 
> 
> Queue 인터페이스는 LinkedList에 new키워드를 적용하여 사용. 줄서서 기다림. 선입선출. 삽입연산 'offer'(인큐), 삭제연산 'poll'(디큐)
> 
>
### Generic
> 컴파일 과정에서 객체의 타입체크를 해주는 기능
> 
> 객체의 타입안정성을 높이고 형변환의 번거로움을 줄여주어 코드가 간결해짐
> 
> 제네릭 사용법 <타입> : public class 클래스명 <T> {...} or public interface 인터페이스명 <T> {..}
>
> 클래스를 설계할 때 구체적인 타입을 명시하지 않고 타입 파라미터로 넣어두었다가 실제 설계한 클래스가 사용되어질 때 ExClassGeneric<String> exGeneric = new ExClassGeneric<>(); 이런식으로 구체적인 타입을 지정하면서 사용하면 타입 변환을 최소화 시킬 수 있음
>
### Final
> final class : 다른 클래스에서 상속 못함
>
> final method : 다른 메소드에서 오버라이딩 하지 못함
>
> final variable : 변하지 않는 상수값으로 생성됨
>
### Access Modifier(접근 제어자)
> public : 어떤 클래스, 패키지 에서도 접근 가능
>
> protected : 해당 패키지 내의 어떤 클래스에서도 접근 가능. 해당 클래스를 상속받은 외부 패키지에서도 접근 가능.
>
> default : 해당 패키지 내에서만 접근이 가능
>
> private : 정의된 해당 클래스 내에서만 접근이 가능
>
### 
  


