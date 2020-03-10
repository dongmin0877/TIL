# System call

시스템콜이란 운영체제에 리소스나 서비스를 요청하려고 사용자 영역에서 시작해서 커널 내부로 들어가는 함수 호출이다. read(), write(), get_narea(), set_tid_address() 등 범위가 다양하다.

System call is the programmatic way in which a computer program requests a service from the kernel of the operating system.

## Invoke system call

사용자 영역의 애플리케이션을 커널 영역으로 직접 연결하는 것은 불가능하다. 따라서, 시스템 콜을 실행하려 한다는 '시그널'을 커널로 보낸다. 애플리케이션은 실행할 시스템 콜과 매개 변수를 레지스터를 통해 전달한다. 시스템 콜은 0부터 시작하며 시스템 콜을 호출하려면 레지스터에 해당 시스템 콜을 먼저 저장해야 한다.


