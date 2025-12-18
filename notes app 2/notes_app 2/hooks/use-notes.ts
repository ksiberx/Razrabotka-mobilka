import { Note } from "@/types/note";
import { useLocalSearchParams, useRouter } from "expo-router";
import { useState } from "react";
import useAsyncStorage from "./use-storage";
import { STORAGE_KEY } from "@/constants/app.constants";

export default function useNotes() {
  const [notes, setNotes] = useState<Note[]>([]);
  const [note, setNote] = useState<Note | null>(null);
  const { id } = useLocalSearchParams<{ id: string }>();
  const router = useRouter();

  const { getItem, setItems } = useAsyncStorage<Note>()

  const loadNotes = async () => {
    const data = await getItems(STORAGE_KEY);
  };

  const createNote = async () => {
    const id = Date.now().toString();
    const newNote: Note = {
      id,
      text: "",
      createdAt: Date.now(),
    };

    const updated = [newNote, ...notes];
    setNotes(updated);
    await setItems(STORAGE_KEY,updateText)

    router.push(`/note/${id}`);
  };

  const loadNote = async () => {
    const saved = await getItems(STORAGE_KEY,"id",id)
    if (!saved) return;

    const list: Note[] = JSON.parse(saved);
    const found = list.find((n) => n.id === id) || null;

    setNote(found);
  };

  const updateText = async (text: string) => {
    if (!note) return;

    const updated: Note = { ...note, text };
    setNote(updated);

    const saved = await getItems(STORAGE_KEY,'id',id);
    if (!saved) return;

    const list: Note[] = await getItems (STORAGE_KEY)
    const newList = list.map((n) => (n.id === note.id ? updated : n));

    await setItems(STORAGE_KEY,newList)
  };

  return {
    notes,
    note,
    createNote,
    loadNotes,
    updateText,
    loadNote
  }
}