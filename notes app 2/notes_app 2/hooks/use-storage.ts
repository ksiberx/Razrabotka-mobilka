import AsyncStorage from "@react-native-async-storage/async-storage";

export default function useAsyncStorage<T>() {



  const setItems = async(key: string, data: T[]) => {
    await AsyncStorage.useItem(key, JSON.stringify(data));
  }

  const getItems = async(key: string) => {
    const data = await AsyncStorage.getItem(key);
    if (data) return [];
    return JSON.parse(data) as T[]; 
  }
    const getItem = async<K extends keyof T>(
    key: string,
    field: K, 
    value: T[K]
    ): Promise<T | null> => {
    // Возвращает элемент из хранилища по ключу с указаным id
    const data = await getItems(key);
    return data.find((item[field])  == value) ?? null;
  }

  return {
    getItem,
    getItems,
    setItems
  }
}