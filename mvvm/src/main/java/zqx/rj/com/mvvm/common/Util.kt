package zqx.rj.com.mvvm.common

import java.lang.reflect.ParameterizedType

/**
 * author：  HyZhan
 * created： 2018/10/11 16:04
 * desc：    工具类
 */
class Util {

    companion object {

        @Suppress("UNCHECKED_CAST")
        fun <T> getClass(t: Any): Class<T> {
            // 通过反射 获取父类泛型 (T) 对应 Class类
            return (t.javaClass.genericSuperclass as ParameterizedType)
                    .actualTypeArguments[0]
                    as Class<T>

        }
    }
}