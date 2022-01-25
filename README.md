# Java
Java basic syntax and concepts for interview

### JVM(Java Virtual Machine)
> - JVM은 자바 애플리케이션을 클래스 로더를 통해 읽어 들여 자바 API와 함께 실행하는 스택 기반의 가상머신
> 
> - Java와 OS사이에의 중개자 역할, Java가 OS에 구애받지 않고 재사용을 가능하게 해 줌
> 
> - 메모리관리, Garbage collection을 수행
>
### 자바프로그램 실행과정
> - 프로그램 실행 시 JVM이 OS로부터 필요로하는 메모리를 할당받음. JVM은 용도에 따라 메모리를 여러 영역으로 나누어 관리.
> 
> - 자바 컴파일러가 자바 소스코드(.java)를 읽어들여 자바 바이트코드(.class)로 변환시킴
> 
> - class loader를 통해 class파일들을 JVM으로 로딩함
> 
> - 로딩된 class 파일들은 Execution engine(실행 엔진)을 통해 해석됨
> 
> - 해석된 바이트코드는 Runtime Data Areas에 배치되어 실질적인 수행이 이루어짐
> 
> - 이 실행과정 속에서 JVM은 Thread Synchronization과 GC(Garbage Collection) 같은 관리작업을 수행
>
### GC(Garbage Collection)
> - Java 에서는 개발자가 프로그램 코드로 메모리를 명시적으로 해제하지 않기 때문에 Garbage Collector가 더 이상 필요 없는 (쓰레기) 객체를 찾아 지우는 작업을 함
> 
> - 'stop-the-world' : GC를 실행하기 위해서 JVM이 애플리케이션 실행을 멈추는 것
> 
> - 'Mark and Sweep' : 사용되는 메모리와 사용되지 않는 메모리를 식별 -> Mark단계에서 사용되지 않는다고 식별된 메모리를 해제
> 
### Java Collection
> 
