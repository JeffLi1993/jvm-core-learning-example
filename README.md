推荐工具：

[微信公众号 Markdown 编辑器 - OpenWrite](https://md.openwrite.cn/)：Markdown 微信编辑器是一款专业强大的微信公众平台在线编辑排版工具，提供手机预览功能，让用户在微信图文 、文章、内容排版、文本编辑、素材编辑上更加方便。 - [更多介绍](https://openwrite.cn/product-markdown)

[博客群发平台](https://openwrite.cn)

# jvm-core-learning-example
关于Java虚拟机核心知识点学习积累的例子，是初学者及虚拟机核心知识巩固的最佳实践。

## 作者与学习乐园
源码地址:我的[GitHub地址](https://github.com/JeffLi1993 "GitHub")<br>
作者： [李强强](http://www.bysocket.com/ "李强强")<br>

## 项目结构
- src 目录<br>
Java虚拟机核心知识点学习代码兼测试案例<br>
- test目录(测试包名与src目录保持一致)<br>
对应学习代码包的详细测试案例<br>

包目录：

	├── org.jvmcore.classloader		// 类加载器
	├── org.javacore.heap		// 堆
	├── org.javacore.memory		// 内存
	├── org.javacore.stack		// 栈
	│
	拼命更新！顶！d=====(￣▽￣*)b

详细目录：

	├── README.md						// 项目唯一详细文档
	├── org.jvmcore.classloader	// 类加载器
	├── 	ClassLoaderInfoT.java		// 打印类加载器信息
	├── 	InitMain.java				// 子类的初始化过程和主动引用
	├── 	StringCL.java				// 类加载 - Class.forName
	├── 	UseFinalField.java			// Final字段不会被引起初始化
	├── org.javacore.heap			// 堆
	├── 	JvmXmxArgs.java				// 打印堆内存
	├── org.javacore.memory		// 内存
	├── 	FloatInJvm.java				// 输出浮点数在虚拟机的实际表示
	├── 	IntegerInJvm.java			// 负整形数在Jvm中的表示
	├── org.javacore.stack		// 栈
	├── 	LocalVarGC.java				// 打印GC信息
	├── 	StackDeep.java				// 堆溢出的理解
	拼命更新！顶！d=====(￣▽￣*)b

##学习方法
根据包目录，进行一块一块学习。然后针对某类，请看下相对应的test包或者src下直接测试案例，进行学习。
